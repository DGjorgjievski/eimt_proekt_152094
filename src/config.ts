export type LocationType = {
  id: number;
  name: string;
  address: string;
  image: string;
  totalSpaces: number;
};

export type UserReservation = {
  id: number;
  userId: number;
  localName: string;
  numberOfTables: number;
  dateTime: string;
  isConfirmed: boolean;
}

export const API = new URL("http://localhost:8080/api");
